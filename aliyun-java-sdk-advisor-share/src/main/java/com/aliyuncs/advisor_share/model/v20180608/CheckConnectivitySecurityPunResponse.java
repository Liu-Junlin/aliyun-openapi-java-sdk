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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.CheckConnectivitySecurityPunResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckConnectivitySecurityPunResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String securityPunishResult;

		private String checkId;

		private Integer severity;

		private String errorCode;

		public String getSecurityPunishResult() {
			return this.securityPunishResult;
		}

		public void setSecurityPunishResult(String securityPunishResult) {
			this.securityPunishResult = securityPunishResult;
		}

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public Integer getSeverity() {
			return this.severity;
		}

		public void setSeverity(Integer severity) {
			this.severity = severity;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	@Override
	public CheckConnectivitySecurityPunResponse getInstance(UnmarshallerContext context) {
		return	CheckConnectivitySecurityPunResponseUnmarshaller.unmarshall(this, context);
	}
}
