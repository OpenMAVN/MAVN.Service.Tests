package com.lykke.tests.api.service.customer.model.earnrule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EarnRulesListResponseModel {

    private EarnRuleModel[] earnRules;
    private int totalCount;

    public EarnRulesListResponseModel() {
        earnRules = new EarnRuleModel[]{};
    }
}
