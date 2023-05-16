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

package com.aliyuncs.agency.model.v20180703;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetAssociationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAssociationStatusResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private List<Result> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Result> getData() {
		return this.data;
	}

	public void setData(List<Result> data) {
		this.data = data;
	}

	public static class Result {

		private String code;

		private String message;

		private Boolean success;

		private InviteStatusList inviteStatusList;

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

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public InviteStatusList getInviteStatusList() {
			return this.inviteStatusList;
		}

		public void setInviteStatusList(InviteStatusList inviteStatusList) {
			this.inviteStatusList = inviteStatusList;
		}

		public static class InviteStatusList {

			private String gmtCreate;

			private Integer status;

			private String subAccountType;

			private String parentId;

			private String validTime;

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getSubAccountType() {
				return this.subAccountType;
			}

			public void setSubAccountType(String subAccountType) {
				this.subAccountType = subAccountType;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public String getValidTime() {
				return this.validTime;
			}

			public void setValidTime(String validTime) {
				this.validTime = validTime;
			}
		}
	}

	@Override
	public GetAssociationStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAssociationStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
