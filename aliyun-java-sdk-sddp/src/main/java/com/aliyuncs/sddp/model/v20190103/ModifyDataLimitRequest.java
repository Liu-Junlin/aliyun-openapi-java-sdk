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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDataLimitRequest extends RpcAcsRequest<ModifyDataLimitResponse> {
	   

	private Boolean modifyPassword;

	private List<String> vSwitchIdLists;

	private Integer samplingSize;

	private String password;

	private Long id;

	private String lang;

	private String serviceRegionId;

	private String engineType;

	private Integer auditStatus;

	private Integer autoScan;

	private List<String> securityGroupIdLists;

	private Integer logStoreDay;

	private Integer resourceType;

	private Integer port;

	private String vpcId;

	private String userName;
	public ModifyDataLimitRequest() {
		super("Sddp", "2019-01-03", "ModifyDataLimit", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getModifyPassword() {
		return this.modifyPassword;
	}

	public void setModifyPassword(Boolean modifyPassword) {
		this.modifyPassword = modifyPassword;
		if(modifyPassword != null){
			putQueryParameter("ModifyPassword", modifyPassword.toString());
		}
	}

	public List<String> getVSwitchIdLists() {
		return this.vSwitchIdLists;
	}

	public void setVSwitchIdLists(List<String> vSwitchIdLists) {
		this.vSwitchIdLists = vSwitchIdLists;	
		if (vSwitchIdLists != null) {
			for (int i = 0; i < vSwitchIdLists.size(); i++) {
				putQueryParameter("VSwitchIdList." + (i + 1) , vSwitchIdLists.get(i));
			}
		}	
	}

	public Integer getSamplingSize() {
		return this.samplingSize;
	}

	public void setSamplingSize(Integer samplingSize) {
		this.samplingSize = samplingSize;
		if(samplingSize != null){
			putQueryParameter("SamplingSize", samplingSize.toString());
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public String getServiceRegionId() {
		return this.serviceRegionId;
	}

	public void setServiceRegionId(String serviceRegionId) {
		this.serviceRegionId = serviceRegionId;
		if(serviceRegionId != null){
			putQueryParameter("ServiceRegionId", serviceRegionId);
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
		}
	}

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
		if(auditStatus != null){
			putQueryParameter("AuditStatus", auditStatus.toString());
		}
	}

	public Integer getAutoScan() {
		return this.autoScan;
	}

	public void setAutoScan(Integer autoScan) {
		this.autoScan = autoScan;
		if(autoScan != null){
			putQueryParameter("AutoScan", autoScan.toString());
		}
	}

	public List<String> getSecurityGroupIdLists() {
		return this.securityGroupIdLists;
	}

	public void setSecurityGroupIdLists(List<String> securityGroupIdLists) {
		this.securityGroupIdLists = securityGroupIdLists;	
		if (securityGroupIdLists != null) {
			for (int i = 0; i < securityGroupIdLists.size(); i++) {
				putQueryParameter("SecurityGroupIdList." + (i + 1) , securityGroupIdLists.get(i));
			}
		}	
	}

	public Integer getLogStoreDay() {
		return this.logStoreDay;
	}

	public void setLogStoreDay(Integer logStoreDay) {
		this.logStoreDay = logStoreDay;
		if(logStoreDay != null){
			putQueryParameter("LogStoreDay", logStoreDay.toString());
		}
	}

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<ModifyDataLimitResponse> getResponseClass() {
		return ModifyDataLimitResponse.class;
	}

}
