package com.weahan.tokenizer;

import org.wltea.analyzer.cfg.Configuration;

import java.util.List;

/**
 * @Author Rock Lee
 * @Date 2019/1/11 0011 14:47
 */
public class TokenizerConfiguration implements Configuration {

    public boolean useSmart = true;

    @Override
    public boolean useSmart() {
        return useSmart;
    }

    @Override
    public void setUseSmart(boolean useSmart) {
        this.useSmart = useSmart;
    }

    @Override
    public String getMainDictionary() {
        return null;
    }

    @Override
    public String getQuantifierDicionary() {
        return null;
    }

    @Override
    public List<String> getExtDictionarys() {
        return null;
    }

    @Override
    public List<String> getExtStopWordDictionarys() {
        return null;
    }
}
