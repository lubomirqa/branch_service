package com.sixt.service.branch.adapter.handler.rpc;

import com.sixt.service.branch.api.BranchOuterClass;
import com.sixt.service.branch.api.SearchOnlineOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import spring.boot.starter.sixtgoorange.copiedfromjamicro.OrangeContext;
import spring.boot.starter.sixtgoorange.copiedfromjamicro.ServiceMethodHandler;
import spring.boot.starter.sixtgoorange.copiedfromjamicro.webservice.RpcHandler;

import javax.annotation.ParametersAreNonnullByDefault;

@Component
@RpcHandler("SearchOnline.GetBranchesWithFilters")
@ParametersAreNonnullByDefault
public final class GetBranchesWithFiltersHandler
        implements
        ServiceMethodHandler<SearchOnlineOuterClass.FilteringParameters, SearchOnlineOuterClass.BranchesResponse> {

    private static final Logger LOG = LoggerFactory.getLogger(GetBranchesWithFiltersHandler.class);

    @Override
    public SearchOnlineOuterClass.BranchesResponse handleRequest(SearchOnlineOuterClass.FilteringParameters request,
            OrangeContext ctx) {
        LOG.info("Get GetBranchesWithFilters request received: " + request);
        //return SearchOnlineOuterClass.BranchesResponse.newBuilder().build();
                return SearchOnlineOuterClass.BranchesResponse.newBuilder()
                        .addBranches(BranchOuterClass.BranchObject.newBuilder()
                                .setBranchId(411)
                                .setName("Aachen 24h")
                                .setLocale("de_DE")
                                .setFleet(BranchOuterClass.Fleet.newBuilder()
                                        .setPool(BranchOuterClass.Pool.newBuilder()
                                                .setPoolID(5463)
                                                .setName("Aachen DT")
                                                .build())
                                        .build())
                                .build())
                        .build();
    }
}
