/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRuleRequest extends RpcAcsRequest<CreateRuleResponse> {
	   

	private Integer warnLevel;

	private String productCode;

	private Long productId;

	private String description;

	private Long riskLevelId;

	private String content;

	private Integer matchType;

	private String lang;

	private Integer supportForm;

	private Integer ruleType;

	private String statExpress;

	private Integer contentCategory;

	private String target;

	private String name;

	private Integer category;

	private Integer status;
	public CreateRuleRequest() {
		super("Sddp", "2019-01-03", "CreateRule", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getWarnLevel() {
		return this.warnLevel;
	}

	public void setWarnLevel(Integer warnLevel) {
		this.warnLevel = warnLevel;
		if(warnLevel != null){
			putQueryParameter("WarnLevel", warnLevel.toString());
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getRiskLevelId() {
		return this.riskLevelId;
	}

	public void setRiskLevelId(Long riskLevelId) {
		this.riskLevelId = riskLevelId;
		if(riskLevelId != null){
			putQueryParameter("RiskLevelId", riskLevelId.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Integer getMatchType() {
		return this.matchType;
	}

	public void setMatchType(Integer matchType) {
		this.matchType = matchType;
		if(matchType != null){
			putQueryParameter("MatchType", matchType.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getSupportForm() {
		return this.supportForm;
	}

	public void setSupportForm(Integer supportForm) {
		this.supportForm = supportForm;
		if(supportForm != null){
			putQueryParameter("SupportForm", supportForm.toString());
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType.toString());
		}
	}

	public String getStatExpress() {
		return this.statExpress;
	}

	public void setStatExpress(String statExpress) {
		this.statExpress = statExpress;
		if(statExpress != null){
			putQueryParameter("StatExpress", statExpress);
		}
	}

	public Integer getContentCategory() {
		return this.contentCategory;
	}

	public void setContentCategory(Integer contentCategory) {
		this.contentCategory = contentCategory;
		if(contentCategory != null){
			putQueryParameter("ContentCategory", contentCategory.toString());
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<CreateRuleResponse> getResponseClass() {
		return CreateRuleResponse.class;
	}

}
