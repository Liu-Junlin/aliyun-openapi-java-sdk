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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailabilityZonesRequest extends RpcAcsRequest<DescribeAvailabilityZonesResponse> {
	   

	private Long resourceOwnerId;

	private String storageType;

	private String resourceGroupId;

	private String securityToken;

	private String excludeZoneId;

	private String excludeSecondaryZoneId;

	private String instanceChargeType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String mongoType;

	private Long ownerId;

	private String storageSupport;

	private String dbType;

	private String acceptLanguage;

	private String zoneId;
	public DescribeAvailabilityZonesRequest() {
		super("Dds", "2015-12-01", "DescribeAvailabilityZones", "dds");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getExcludeZoneId() {
		return this.excludeZoneId;
	}

	public void setExcludeZoneId(String excludeZoneId) {
		this.excludeZoneId = excludeZoneId;
		if(excludeZoneId != null){
			putQueryParameter("ExcludeZoneId", excludeZoneId);
		}
	}

	public String getExcludeSecondaryZoneId() {
		return this.excludeSecondaryZoneId;
	}

	public void setExcludeSecondaryZoneId(String excludeSecondaryZoneId) {
		this.excludeSecondaryZoneId = excludeSecondaryZoneId;
		if(excludeSecondaryZoneId != null){
			putQueryParameter("ExcludeSecondaryZoneId", excludeSecondaryZoneId);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getMongoType() {
		return this.mongoType;
	}

	public void setMongoType(String mongoType) {
		this.mongoType = mongoType;
		if(mongoType != null){
			putQueryParameter("MongoType", mongoType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getStorageSupport() {
		return this.storageSupport;
	}

	public void setStorageSupport(String storageSupport) {
		this.storageSupport = storageSupport;
		if(storageSupport != null){
			putQueryParameter("StorageSupport", storageSupport);
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putQueryParameter("DbType", dbType);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<DescribeAvailabilityZonesResponse> getResponseClass() {
		return DescribeAvailabilityZonesResponse.class;
	}

}
