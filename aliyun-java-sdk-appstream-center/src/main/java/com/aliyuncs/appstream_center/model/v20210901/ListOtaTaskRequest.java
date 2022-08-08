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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListOtaTaskRequest extends RpcAcsRequest<ListOtaTaskResponse> {
	   

	private String otaType;

	private Integer pageNumber;

	private String appInstanceGroupId;

	private Integer pageSize;
	public ListOtaTaskRequest() {
		super("appstream-center", "2021-09-01", "ListOtaTask");
		setMethod(MethodType.POST);
	}

	public String getOtaType() {
		return this.otaType;
	}

	public void setOtaType(String otaType) {
		this.otaType = otaType;
		if(otaType != null){
			putBodyParameter("OtaType", otaType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
		if(appInstanceGroupId != null){
			putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListOtaTaskResponse> getResponseClass() {
		return ListOtaTaskResponse.class;
	}

}
