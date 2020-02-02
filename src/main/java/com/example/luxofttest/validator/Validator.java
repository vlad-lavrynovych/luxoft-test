package com.example.luxofttest.validator;

import com.example.luxofttest.domain.NodeEntity;

public interface Validator {
    boolean isValid(NodeEntity nodeEntity);
}
