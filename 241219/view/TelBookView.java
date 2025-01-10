package view;

import dto.SearchResultDTO;
import dto.TelBookDTO;
import exception.InputValidation;
import exception.MyException;
import service.PhoneBookService;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TelBookView implements ViewInterface{
    Scanner sc = new Scanner(System.in);
    PhoneBookService bookService = new PhoneBookService();

    //입력 확인용 인스턴스 생성
    InputValidation validation = new InputValidation();
    
    @Override
    public void insertViwe() {
        //System.out.println("[PhoneBookViwe] - insertViwe");
        System.out.println("=== 전화번호 등록 ===");

        boolean check = true;
        //빈 연락처 클래스 -> 채워서 서비스로 전달 -> 저장
        TelBookDTO dto = new TelBookDTO();
        //이름 입력하기 처리
        while (check) {
            try {
                System.out.println("이름 : ");
                String  name = sc.next();
                check = validation.nameCheck(name);
                dto.setName(name);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        //나이 체크
        check = true;
        while (check) {
            try {
                System.out.println("나이 : ");
                int age = sc.nextInt();
                check = validation.ageCheck(age);
                dto.setAge(age);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        //주소입력 받기
        System.out.println("주소 : ");
        String address = sc.next();
        dto.setAddress(address);

        //전화번호 입력 처리
        check = true;
        while (check) {
            try {
                System.out.println("전화번호 : ");
                String  phone = sc.next();
                check = validation.phoneCheck(phone);
                dto.setPhone(phone);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        //신규입력이니까  생성일 저장
        dto.setCreatedAt(LocalDateTime.now());
        //서비스로 DTO 전달
        int result = bookService.insertService(dto);
        if (result > 0) {
            System.out.println("자료가 저장되었습니다.");
        } else {
            System.out.println("실패 했습니다. 관리자에게 문의하세요.");
        }
    }

    @Override
    public void updateView() {
        //System.out.println("[PhoneBookViwe] - updateView");
        System.out.println("수정할 전화번호부의 ID를 입력하세요");
        Long updateNum = sc.nextLong();

        //수정할 ID의 레코드를 찾아온다.찾아온 데이터
        TelBookDTO originalDto = bookService.findByIdService(1L);

        //수정할 DTO 정의(빈깡통)
        TelBookDTO updatedto = new TelBookDTO();

        //ID는 출력만...(수정불가)
        System.out.println("수정 ID :" + originalDto.getId());

        //원본이름 출력
        System.out.println("수정 전 이름 : " + originalDto.getName());
        boolean check = true;

        //수정 대상 ID를 updateDTO.id 저장
        updatedto.setId(originalDto.getId());

        //수정할 이름 입력 받고 VAlidation 체크
        while (check) {
            try {
                System.out.println("수정 할 이름 : ");
                String  name = sc.next();
                check = validation.nameCheck(name);
                updatedto.setName(name);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
    }
        //원본이름 출력
        System.out.println("수정 전 나이 : " + originalDto.getAge());
        check = true;

        //수정할 나이 입력 받고 VAlidation 체크
        while (check) {
            try {
                System.out.println("수정 할 나이 : ");
                int age  = sc.nextInt();
                check = validation.ageCheck(age);
                updatedto.setAge(age);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }

            //원본 주소 출력
            System.out.println("수정 전 주소 : " + originalDto.getAddress());
            System.out.println("수정 할 주소 :");
            String address = sc.next();
            updatedto.setAddress(address);

            //전화번호 수정작업
            check = true;
            while (check) {
                try {
                    System.out.println("수정 전 전화번호 : " + originalDto.getPhone());
                    System.out.println("수정 할 전화번호 :");
                    String  phone = sc.next();
                    check = validation.phoneCheck(phone);
                    updatedto.setPhone(phone);
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
            //입력 날짜는 수정 안되니까 옮겨서 저장
            updatedto.setCreatedAt(originalDto.getCreatedAt());

            //수정 날짜는 강제로 오늘로 변경
            updatedto.setUpdatedAt(LocalDateTime.now());

            //서비스로 수정데이터 전송 후 성공유무 확인
            int result = bookService.updateService(updatedto);

            //성공 유무 처리
            if (result > 0) {
                System.out.println("정상적으로 수정되었습니다");
            } else {
                System.out.println("수정 실패. 관리자에게 문의 하세요.");
            }
            }
            }

            @Override
    public void deleteView() {
        //System.out.println("[PhoneBookViwe] - deleteView");
        System.out.println("삭제할 ID를 입력하세요.");
        Long deleteId = sc.nextLong();
        if (bookService.deleteService(deleteId) > 0) {
            System.out.println("ID : " + deleteId + "의 데이터가 삭제 되었습니다.");
        } else {
            System.out.println("삭제에 실패 했습니다. 관리자에게 문의하세요.");
        }
    }

    @Override
    public void searchAllView() {
        //System.out.println("[PhoneBookViwe] - searchAllView");
        List<TelBookDTO> dtoList = bookService.getAllListService();
        //출력해보기
        linePrint();
        printTitle();
        linePrint();
        for (TelBookDTO dto : dtoList){
            System.out.println(dto);
        }
        linePrint();
    }

    public void  linePrint(){
        System.out.println("================================================================================");
    }

    public void printTitle(){
        System.out.println("ID \t 이름 \t 나이 \t     주소 \t        전화번호 \t       입력 \t         수정 \t");
    }

    public void SearchprintTitle(){
        System.out.println("ID \t 이름 \t 나이 \t     주소 \t        전화번호 \t");
    }

    @Override
    public void searchNameView() {
        //System.out.println("[PhoneBookViwe] - searchNameView");
        System.out.println("이름으로 검색하는 화면 입니다.");
        System.out.println("검색할 이름의 일부나 전체를 입력하세요");
        String keyword = sc.next();
        List<SearchResultDTO> result = bookService.findByNameService(keyword);
        linePrint();
        SearchprintTitle();
        linePrint();

        if (result.isEmpty()){
            System.out.println("검색 결과가 없습니다. ");
        }else {
            result.forEach(x -> System.out.println(x));
        }
        linePrint();
    }

    @Override
    public void searchPhoneView() {
        //System.out.println("[PhoneBookViwe] - searchPhoneView");
        System.out.println("전화번호로 검색하는 화면 입니다.");
        System.out.println("검색할 전화번호의 일부나 전체를 입력하세요");
        String keyword = sc.next();
        List<SearchResultDTO> result = bookService
                .findByPhoneService(keyword);
        linePrint();
        SearchprintTitle();
        linePrint();
        if (result.isEmpty()){
            System.out.println("검색 결과가 없습니다");
        }else {
            result.forEach(x -> System.out.println(x));
        }
        linePrint();
    }
}
