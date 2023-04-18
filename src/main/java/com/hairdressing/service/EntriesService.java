package com.hairdressing.service;


import com.hairdressing.model.Entries;

import java.util.ArrayList;
import java.util.Optional;

public interface EntriesService {
    ArrayList<Entries> getAllEntries();
    Optional<Entries> getEntriesById(Long id);
    Entries saveEntries(Entries entries);
    boolean deleteEntriesById(Long id);

}
