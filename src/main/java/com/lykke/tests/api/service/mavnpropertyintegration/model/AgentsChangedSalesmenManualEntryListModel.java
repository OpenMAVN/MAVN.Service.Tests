package com.lykke.tests.api.service.mavnpropertyintegration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class AgentsChangedSalesmenManualEntryListModel {

    public AgentChangedSalesmanManualEntryModel[] agentsChangedSalesmen;
}
