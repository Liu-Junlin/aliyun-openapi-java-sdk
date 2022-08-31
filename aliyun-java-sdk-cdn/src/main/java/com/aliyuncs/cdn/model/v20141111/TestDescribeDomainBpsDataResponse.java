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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.TestDescribeDomainBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TestDescribeDomainBpsDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String ispNameEn;

	private String requestId;

	private String locationNameEn;

	private String locationName;

	private String ispName;

	private String domainName;

	private String dataInterval;

	private List<DataModule> bpsDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getIspNameEn() {
		return this.ispNameEn;
	}

	public void setIspNameEn(String ispNameEn) {
		this.ispNameEn = ispNameEn;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLocationNameEn() {
		return this.locationNameEn;
	}

	public void setLocationNameEn(String locationNameEn) {
		this.locationNameEn = locationNameEn;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getIspName() {
		return this.ispName;
	}

	public void setIspName(String ispName) {
		this.ispName = ispName;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getBpsDataPerInterval() {
		return this.bpsDataPerInterval;
	}

	public void setBpsDataPerInterval(List<DataModule> bpsDataPerInterval) {
		this.bpsDataPerInterval = bpsDataPerInterval;
	}

	public static class DataModule {

		private String l2Value;

		private String dynamicValue;

		private String dynamicDomesticValue;

		private String domesticValue;

		private String value;

		private String overseasL2Value;

		private String staticDomesticValue;

		private String domesticL2Value;

		private String overseasValue;

		private String staticValue;

		private String timeStamp;

		private String staticOverseasValue;

		private String dynamicOverseasValue;

		public String getL2Value() {
			return this.l2Value;
		}

		public void setL2Value(String l2Value) {
			this.l2Value = l2Value;
		}

		public String getDynamicValue() {
			return this.dynamicValue;
		}

		public void setDynamicValue(String dynamicValue) {
			this.dynamicValue = dynamicValue;
		}

		public String getDynamicDomesticValue() {
			return this.dynamicDomesticValue;
		}

		public void setDynamicDomesticValue(String dynamicDomesticValue) {
			this.dynamicDomesticValue = dynamicDomesticValue;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOverseasL2Value() {
			return this.overseasL2Value;
		}

		public void setOverseasL2Value(String overseasL2Value) {
			this.overseasL2Value = overseasL2Value;
		}

		public String getStaticDomesticValue() {
			return this.staticDomesticValue;
		}

		public void setStaticDomesticValue(String staticDomesticValue) {
			this.staticDomesticValue = staticDomesticValue;
		}

		public String getDomesticL2Value() {
			return this.domesticL2Value;
		}

		public void setDomesticL2Value(String domesticL2Value) {
			this.domesticL2Value = domesticL2Value;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}

		public String getStaticValue() {
			return this.staticValue;
		}

		public void setStaticValue(String staticValue) {
			this.staticValue = staticValue;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getStaticOverseasValue() {
			return this.staticOverseasValue;
		}

		public void setStaticOverseasValue(String staticOverseasValue) {
			this.staticOverseasValue = staticOverseasValue;
		}

		public String getDynamicOverseasValue() {
			return this.dynamicOverseasValue;
		}

		public void setDynamicOverseasValue(String dynamicOverseasValue) {
			this.dynamicOverseasValue = dynamicOverseasValue;
		}
	}

	@Override
	public TestDescribeDomainBpsDataResponse getInstance(UnmarshallerContext context) {
		return	TestDescribeDomainBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
