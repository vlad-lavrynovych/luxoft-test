package com.example.luxofttest.services;

import com.example.luxofttest.domain.NodeEntity;
import com.example.luxofttest.exceptions.InvalidRequestException;

import java.util.List;
import java.util.Map;

public interface NodeService {
    NodeEntity createNewNode(String parentId, NodeEntity nodeEntity) throws InvalidRequestException;

    NodeEntity updateNode(String id, NodeEntity networkDetails) throws InvalidRequestException;

    NodeEntity getNodeById(String id);

    Map<String, Boolean> deleteNodeById(String id);

    List<NodeEntity> getAllNodes();
}
