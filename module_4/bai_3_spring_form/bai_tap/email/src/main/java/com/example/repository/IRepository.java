package com.example.repository;

import com.example.model.SettingData;

public interface IRepository {

    SettingData read();

    void save(SettingData email);
}
