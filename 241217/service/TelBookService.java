package service;

import dto.TelBookDto;
import repository.TelBookRepository;

import java.util.ArrayList;
import java.util.List;

public class TelBookService {
    TelBookRepository repository = new TelBookRepository();
    public int input(TelBookDto telBookDto) {
        return repository.insert(telBookDto);
    }

    public List<TelBookDto> getAllList() {
        return repository.getListAll();
    }

    public int deleteId(int deleteId) {
        return repository.delete((int)deleteId);
    }

    public TelBookDto findById(int updateId) {
        return repository.findById(updateId);
    }

    public int update(TelBookDto dto) {
        return repository.update(dto);
    }

    public List<TelBookDto> searchName(String searchName) {
        return repository.searchName(searchName);
    }
}