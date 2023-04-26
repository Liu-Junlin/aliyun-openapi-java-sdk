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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.ListAccountEcsQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccountEcsQuotasResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<EcsQuota> ecsQuotas;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsQuota> getEcsQuotas() {
		return this.ecsQuotas;
	}

	public void setEcsQuotas(List<EcsQuota> ecsQuotas) {
		this.ecsQuotas = ecsQuotas;
	}

	public static class EcsQuota {

		private String quotaResourceName;

		private Long baseQuota;

		private String quotaResourceType;

		private String quotaUnit;

		private String chargeType;

		private String networkType;

		private Long reservedQuota;

		private Long reservedQuotaUsage;

		private String regionId;

		private Long totalQuotaUsage;

		private Long baseQuotaUsage;

		private String applicationStatus;

		private String zoneId;

		private Long totalQuota;

		public String getQuotaResourceName() {
			return this.quotaResourceName;
		}

		public void setQuotaResourceName(String quotaResourceName) {
			this.quotaResourceName = quotaResourceName;
		}

		public Long getBaseQuota() {
			return this.baseQuota;
		}

		public void setBaseQuota(Long baseQuota) {
			this.baseQuota = baseQuota;
		}

		public String getQuotaResourceType() {
			return this.quotaResourceType;
		}

		public void setQuotaResourceType(String quotaResourceType) {
			this.quotaResourceType = quotaResourceType;
		}

		public String getQuotaUnit() {
			return this.quotaUnit;
		}

		public void setQuotaUnit(String quotaUnit) {
			this.quotaUnit = quotaUnit;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Long getReservedQuota() {
			return this.reservedQuota;
		}

		public void setReservedQuota(Long reservedQuota) {
			this.reservedQuota = reservedQuota;
		}

		public Long getReservedQuotaUsage() {
			return this.reservedQuotaUsage;
		}

		public void setReservedQuotaUsage(Long reservedQuotaUsage) {
			this.reservedQuotaUsage = reservedQuotaUsage;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getTotalQuotaUsage() {
			return this.totalQuotaUsage;
		}

		public void setTotalQuotaUsage(Long totalQuotaUsage) {
			this.totalQuotaUsage = totalQuotaUsage;
		}

		public Long getBaseQuotaUsage() {
			return this.baseQuotaUsage;
		}

		public void setBaseQuotaUsage(Long baseQuotaUsage) {
			this.baseQuotaUsage = baseQuotaUsage;
		}

		public String getApplicationStatus() {
			return this.applicationStatus;
		}

		public void setApplicationStatus(String applicationStatus) {
			this.applicationStatus = applicationStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Long getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Long totalQuota) {
			this.totalQuota = totalQuota;
		}
	}

	@Override
	public ListAccountEcsQuotasResponse getInstance(UnmarshallerContext context) {
		return	ListAccountEcsQuotasResponseUnmarshaller.unmarshall(this, context);
	}
}
