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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.QueryJenkinsImageRegistryPersistenceDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryJenkinsImageRegistryPersistenceDayResponse extends AcsResponse {

	private Integer data;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private Long timeCost;

	public Integer getData() {
		return this.data;
	}

	public void setData(Integer data) {
		this.data = data;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getTimeCost() {
		return this.timeCost;
	}

	public void setTimeCost(Long timeCost) {
		this.timeCost = timeCost;
	}

	@Override
	public QueryJenkinsImageRegistryPersistenceDayResponse getInstance(UnmarshallerContext context) {
		return	QueryJenkinsImageRegistryPersistenceDayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
