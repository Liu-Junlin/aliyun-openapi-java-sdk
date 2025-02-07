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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListStackResourceDriftsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackResourceDriftsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<ResourceDrift> resourceDrifts;

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

	public List<ResourceDrift> getResourceDrifts() {
		return this.resourceDrifts;
	}

	public void setResourceDrifts(List<ResourceDrift> resourceDrifts) {
		this.resourceDrifts = resourceDrifts;
	}

	public static class ResourceDrift {

		private String logicalResourceId;

		private String stackId;

		private String physicalResourceId;

		private String driftDetectionTime;

		private String resourceType;

		private String expectedProperties;

		private String resourceDriftStatus;

		private String actualProperties;

		private List<PropertyDifference> propertyDifferences;

		public String getLogicalResourceId() {
			return this.logicalResourceId;
		}

		public void setLogicalResourceId(String logicalResourceId) {
			this.logicalResourceId = logicalResourceId;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getPhysicalResourceId() {
			return this.physicalResourceId;
		}

		public void setPhysicalResourceId(String physicalResourceId) {
			this.physicalResourceId = physicalResourceId;
		}

		public String getDriftDetectionTime() {
			return this.driftDetectionTime;
		}

		public void setDriftDetectionTime(String driftDetectionTime) {
			this.driftDetectionTime = driftDetectionTime;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getExpectedProperties() {
			return this.expectedProperties;
		}

		public void setExpectedProperties(String expectedProperties) {
			this.expectedProperties = expectedProperties;
		}

		public String getResourceDriftStatus() {
			return this.resourceDriftStatus;
		}

		public void setResourceDriftStatus(String resourceDriftStatus) {
			this.resourceDriftStatus = resourceDriftStatus;
		}

		public String getActualProperties() {
			return this.actualProperties;
		}

		public void setActualProperties(String actualProperties) {
			this.actualProperties = actualProperties;
		}

		public List<PropertyDifference> getPropertyDifferences() {
			return this.propertyDifferences;
		}

		public void setPropertyDifferences(List<PropertyDifference> propertyDifferences) {
			this.propertyDifferences = propertyDifferences;
		}

		public static class PropertyDifference {

			private String actualValue;

			private String differenceType;

			private String propertyPath;

			private String expectedValue;

			public String getActualValue() {
				return this.actualValue;
			}

			public void setActualValue(String actualValue) {
				this.actualValue = actualValue;
			}

			public String getDifferenceType() {
				return this.differenceType;
			}

			public void setDifferenceType(String differenceType) {
				this.differenceType = differenceType;
			}

			public String getPropertyPath() {
				return this.propertyPath;
			}

			public void setPropertyPath(String propertyPath) {
				this.propertyPath = propertyPath;
			}

			public String getExpectedValue() {
				return this.expectedValue;
			}

			public void setExpectedValue(String expectedValue) {
				this.expectedValue = expectedValue;
			}
		}
	}

	@Override
	public ListStackResourceDriftsResponse getInstance(UnmarshallerContext context) {
		return	ListStackResourceDriftsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
