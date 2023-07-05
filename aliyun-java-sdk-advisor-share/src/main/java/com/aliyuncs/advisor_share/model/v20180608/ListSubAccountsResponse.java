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
import com.aliyuncs.advisor_share.transform.v20180608.ListSubAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubAccountsResponse extends AcsResponse {

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

		private Integer pageNo;

		private Integer pageSize;

		private Integer total;

		private List<Resource> result;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Resource> getResult() {
			return this.result;
		}

		public void setResult(List<Resource> result) {
			this.result = result;
		}

		public static class Resource {

			private Long id;

			private Long primaryAliyunId;

			private String primaryUserName;

			private Long subAliyunId;

			private String subUserName;

			private Integer status;

			private String gmtModified;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getPrimaryAliyunId() {
				return this.primaryAliyunId;
			}

			public void setPrimaryAliyunId(Long primaryAliyunId) {
				this.primaryAliyunId = primaryAliyunId;
			}

			public String getPrimaryUserName() {
				return this.primaryUserName;
			}

			public void setPrimaryUserName(String primaryUserName) {
				this.primaryUserName = primaryUserName;
			}

			public Long getSubAliyunId() {
				return this.subAliyunId;
			}

			public void setSubAliyunId(Long subAliyunId) {
				this.subAliyunId = subAliyunId;
			}

			public String getSubUserName() {
				return this.subUserName;
			}

			public void setSubUserName(String subUserName) {
				this.subUserName = subUserName;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public ListSubAccountsResponse getInstance(UnmarshallerContext context) {
		return	ListSubAccountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
