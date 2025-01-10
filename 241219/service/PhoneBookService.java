package service;

import dto.SearchResultDTO;
import dto.TelBookDTO;
import repository.PhoneBookRepository;

import java.util.List;

public class PhoneBookService implements ServiceInterface{
    PhoneBookRepository bookRepository = new PhoneBookRepository();

    @Override
    public int insertService(TelBookDTO dto) {
        //System.out.println("[PhoneBookService] - insertService");
        return bookRepository.insertData(dto);
    }

    @Override
    public int updateService(TelBookDTO dto) {
        //System.out.println("[PhoneBookService] - updateService");
        return bookRepository.updateData(dto);
    }

    @Override
    public int deleteService(Long id) {
        //System.out.println("[PhoneBookService] - deleteService");
        return bookRepository.deleteDAta(id);
    }

    @Override
    public List<TelBookDTO> getAllListService() {
        //System.out.println("[PhoneBookService] - getAllListService");
        return bookRepository.getAllList();
    }

    @Override
    public TelBookDTO findByIdService(Long id) {
        //System.out.println("[PhoneBookService] - findById");
        return bookRepository.findById(id);
    }

    @Override
    public List<SearchResultDTO> findByNameService(String name) {
        //System.out.println("[PhoneBookService] - findByName");
        return bookRepository.findByName(name);
    }

    @Override
    public List<SearchResultDTO> findByPhoneService(String phone) {
        //System.out.println("[PhoneBookService] - findByPhone");
        return bookRepository.findByPhone(phone);
    }
}
