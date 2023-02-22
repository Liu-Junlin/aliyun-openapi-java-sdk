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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListClientUserDefineRuleTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClientUserDefineRuleTypesResponse extends AcsResponse {

	private String requestId;

	private List<String> userDefineRuleTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getUserDefineRuleTypes() {
		return this.userDefineRuleTypes;
	}

	public void setUserDefineRuleTypes(List<String> userDefineRuleTypes) {
		this.userDefineRuleTypes = userDefineRuleTypes;
	}

	@Override
	public ListClientUserDefineRuleTypesResponse getInstance(UnmarshallerContext context) {
		return	ListClientUserDefineRuleTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
