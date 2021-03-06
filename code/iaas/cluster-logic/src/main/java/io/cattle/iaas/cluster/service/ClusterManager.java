package io.cattle.iaas.cluster.service;

import io.cattle.platform.core.model.Agent;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.IpAddress;
import io.cattle.platform.engine.process.ProcessState;

public interface ClusterManager {

    Instance getClusterServerInstance(Host cluster);

    Agent getClusterServerAgent(Host cluster);

    IpAddress getClusterServerInstanceIp(Instance clusterServerInstance);

    Host getManagingHost(Host cluster);

    void updateClusterServerConfig(ProcessState state, Host cluster);

    void activateCluster(ProcessState state, Host cluster);

}
