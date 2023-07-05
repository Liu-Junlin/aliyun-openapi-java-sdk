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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetSubDomainListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubDomainListResponse extends AcsResponse {

	private String requestId;

	private List<SubDomains> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SubDomains> getData() {
		return this.data;
	}

	public void setData(List<SubDomains> data) {
		this.data = data;
	}

	public static class SubDomains {

		private String status;

		private String domain;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}
	}

	@Override
	public GetSubDomainListResponse getInstance(UnmarshallerContext context) {
		return	GetSubDomainListResponseUnmarshaller.unmarshall(this, context);
	}
}
