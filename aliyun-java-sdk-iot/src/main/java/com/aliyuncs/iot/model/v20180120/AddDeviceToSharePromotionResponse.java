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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.AddDeviceToSharePromotionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddDeviceToSharePromotionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Item> failDeviceSimpleInfoList;

		public List<Item> getFailDeviceSimpleInfoList() {
			return this.failDeviceSimpleInfoList;
		}

		public void setFailDeviceSimpleInfoList(List<Item> failDeviceSimpleInfoList) {
			this.failDeviceSimpleInfoList = failDeviceSimpleInfoList;
		}

		public static class Item {

			private String productKey;

			private String deviceName;

			private Integer failCode;

			private String failReason;

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public Integer getFailCode() {
				return this.failCode;
			}

			public void setFailCode(Integer failCode) {
				this.failCode = failCode;
			}

			public String getFailReason() {
				return this.failReason;
			}

			public void setFailReason(String failReason) {
				this.failReason = failReason;
			}
		}
	}

	@Override
	public AddDeviceToSharePromotionResponse getInstance(UnmarshallerContext context) {
		return	AddDeviceToSharePromotionResponseUnmarshaller.unmarshall(this, context);
	}
}
