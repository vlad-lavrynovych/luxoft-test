package com.example.luxofttest.services;

import com.example.luxofttest.domain.NodeEntity;
import com.example.luxofttest.exceptions.InvalidRequestException;

import java.util.List;
import java.util.Map;

public interface NetworkService {
    NodeEntity createNewNetwork(NodeEntity nodeEntity) throws InvalidRequestException;

    NodeEntity updateNetwork(String id, NodeEntity nodeDetails) throws InvalidRequestException;

    Map<String, Boolean> deleteNetworkById(String id);

    List<NodeEntity> getAllNetworks();

    List<NodeEntity> getChildrenByNetworkId(String id) throws InvalidRequestException;

    NodeEntity getNetworkById(String id);

    NodeEntity setParentNodesForHierarchy(NodeEntity nodeEntity);
}
