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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.ListGovernanceIssueTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGovernanceIssueTablesResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String dynamicErrorCode;

	private String dynamicErrorMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicErrorCode() {
		return this.dynamicErrorCode;
	}

	public void setDynamicErrorCode(String dynamicErrorCode) {
		this.dynamicErrorCode = dynamicErrorCode;
	}

	public String getDynamicErrorMessage() {
		return this.dynamicErrorMessage;
	}

	public void setDynamicErrorMessage(String dynamicErrorMessage) {
		this.dynamicErrorMessage = dynamicErrorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Table> tables;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Table> getTables() {
			return this.tables;
		}

		public void setTables(List<Table> tables) {
			this.tables = tables;
		}

		public static class Table {

			private String datasourceType;

			private String mcProjectName;

			private String clusterId;

			private String databaseName;

			private String schema;

			private String tableName;

			private String tableGuid;

			private Long tableSize;

			private Long lifeCycle;

			private Long createTime;

			private Long lastAccessTime;

			private Integer downstreamDependencyCount;

			private String ruleId;

			private String ruleCategory;

			private Long projectId;

			private String ownerId;

			private String bizDate;

			private String properties;

			public String getDatasourceType() {
				return this.datasourceType;
			}

			public void setDatasourceType(String datasourceType) {
				this.datasourceType = datasourceType;
			}

			public String getMcProjectName() {
				return this.mcProjectName;
			}

			public void setMcProjectName(String mcProjectName) {
				this.mcProjectName = mcProjectName;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getSchema() {
				return this.schema;
			}

			public void setSchema(String schema) {
				this.schema = schema;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getTableGuid() {
				return this.tableGuid;
			}

			public void setTableGuid(String tableGuid) {
				this.tableGuid = tableGuid;
			}

			public Long getTableSize() {
				return this.tableSize;
			}

			public void setTableSize(Long tableSize) {
				this.tableSize = tableSize;
			}

			public Long getLifeCycle() {
				return this.lifeCycle;
			}

			public void setLifeCycle(Long lifeCycle) {
				this.lifeCycle = lifeCycle;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getLastAccessTime() {
				return this.lastAccessTime;
			}

			public void setLastAccessTime(Long lastAccessTime) {
				this.lastAccessTime = lastAccessTime;
			}

			public Integer getDownstreamDependencyCount() {
				return this.downstreamDependencyCount;
			}

			public void setDownstreamDependencyCount(Integer downstreamDependencyCount) {
				this.downstreamDependencyCount = downstreamDependencyCount;
			}

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleCategory() {
				return this.ruleCategory;
			}

			public void setRuleCategory(String ruleCategory) {
				this.ruleCategory = ruleCategory;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}

			public String getProperties() {
				return this.properties;
			}

			public void setProperties(String properties) {
				this.properties = properties;
			}
		}
	}

	@Override
	public ListGovernanceIssueTablesResponse getInstance(UnmarshallerContext context) {
		return	ListGovernanceIssueTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
