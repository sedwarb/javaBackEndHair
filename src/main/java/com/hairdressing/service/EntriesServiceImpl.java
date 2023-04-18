package com.hairdressing.service;

import com.hairdressing.model.Entries;
import com.hairdressing.repository.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EntriesServiceImpl implements EntriesService {

    @Autowired
    EntriesRepository entriesRepository;

    @Override
    public ArrayList<Entries> getAllEntries() {
        return (ArrayList<Entries>) entriesRepository.findAll();
    }

    @Override
    public Optional<Entries> getEntriesById(Long id) {
        return entriesRepository.findById(id);
    }

    @Override
    public Entries saveEntries(Entries entries) {
        return entriesRepository.save(entries);
    }

    @Override
    public boolean deleteEntriesById(Long id) {
        try{
            Optional<Entries> entries = getEntriesById(id);
            entriesRepository.delete(entries.get());
            return true;
        }catch (Exception e){return false;}
    }
}
