package org.andrei.menus.mem_db.api;

import java.util.List;

public interface CSVRepository {
    public void save(String item);
    public List<String> getCsvItems();
}
