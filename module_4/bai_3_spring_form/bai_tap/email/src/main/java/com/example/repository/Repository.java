package com.example.repository;

import com.example.model.SettingData;
import org.springframework.stereotype.Service;

@Service
public class Repository implements IRepository {

    SettingData settingData = new SettingData();

    @Override
    public SettingData read() {
        return settingData;
    }

    @Override
    public void save( SettingData email) {
        settingData.setLanguages(email.getLanguages());
        settingData.setPageSize(email.getPageSize());
        settingData.setSpamsFilter(email.isSpamsFilter());
        settingData.setSignature(email.getSignature());
    }
}
