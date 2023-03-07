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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.CreateIpMappingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateIpMappingRuleResponse extends AcsResponse {

	private String requestId;

	private String ipMappingRuleId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIpMappingRuleId() {
		return this.ipMappingRuleId;
	}

	public void setIpMappingRuleId(String ipMappingRuleId) {
		this.ipMappingRuleId = ipMappingRuleId;
	}

	@Override
	public CreateIpMappingRuleResponse getInstance(UnmarshallerContext context) {
		return	CreateIpMappingRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
