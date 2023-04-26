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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeSpotInstanceAdviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpotInstanceAdviceResponse extends AcsResponse {

	private String regionId;

	private String requestId;

	private List<String> availableSpotZones;

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getAvailableSpotZones() {
		return this.availableSpotZones;
	}

	public void setAvailableSpotZones(List<String> availableSpotZones) {
		this.availableSpotZones = availableSpotZones;
	}

	@Override
	public DescribeSpotInstanceAdviceResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpotInstanceAdviceResponseUnmarshaller.unmarshall(this, context);
	}
}
