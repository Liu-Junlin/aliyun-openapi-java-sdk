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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsRequest extends RpcAcsRequest<DescribeSuspEventsResponse> {
	   

	private String source;

	private String containerFieldName;

	private String sourceIp;

	private String eventNames;

	private String from;

	private Long id;

	private String tacticId;

	private String alarmUniqueInfo;

	private String uniqueInfo;

	private Long groupId;

	private String operateTimeEnd;

	private String name;

	private String status;

	private String uuids;

	private String timeEnd;

	private String targetType;

	private String sortType;

	private String remark;

	private String containerFieldValue;

	private String pageSize;

	private String lang;

	private String dealed;

	private String currentPage;

	private String clusterId;

	private List<String> operateErrorCodeLists;

	private String sortColumn;

	private List<String> assetsTypeLists;

	private String operateTimeStart;

	private String timeStart;

	private String levels;

	private String parentEventTypes;
	public DescribeSuspEventsRequest() {
		super("Sas", "2018-12-03", "DescribeSuspEvents");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getContainerFieldName() {
		return this.containerFieldName;
	}

	public void setContainerFieldName(String containerFieldName) {
		this.containerFieldName = containerFieldName;
		if(containerFieldName != null){
			putQueryParameter("ContainerFieldName", containerFieldName);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getEventNames() {
		return this.eventNames;
	}

	public void setEventNames(String eventNames) {
		this.eventNames = eventNames;
		if(eventNames != null){
			putQueryParameter("EventNames", eventNames);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getTacticId() {
		return this.tacticId;
	}

	public void setTacticId(String tacticId) {
		this.tacticId = tacticId;
		if(tacticId != null){
			putBodyParameter("TacticId", tacticId);
		}
	}

	public String getAlarmUniqueInfo() {
		return this.alarmUniqueInfo;
	}

	public void setAlarmUniqueInfo(String alarmUniqueInfo) {
		this.alarmUniqueInfo = alarmUniqueInfo;
		if(alarmUniqueInfo != null){
			putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
		}
	}

	public String getUniqueInfo() {
		return this.uniqueInfo;
	}

	public void setUniqueInfo(String uniqueInfo) {
		this.uniqueInfo = uniqueInfo;
		if(uniqueInfo != null){
			putQueryParameter("UniqueInfo", uniqueInfo);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getOperateTimeEnd() {
		return this.operateTimeEnd;
	}

	public void setOperateTimeEnd(String operateTimeEnd) {
		this.operateTimeEnd = operateTimeEnd;
		if(operateTimeEnd != null){
			putQueryParameter("OperateTimeEnd", operateTimeEnd);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	public String getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
		if(timeEnd != null){
			putQueryParameter("TimeEnd", timeEnd);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getSortType() {
		return this.sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
		if(sortType != null){
			putQueryParameter("SortType", sortType);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getContainerFieldValue() {
		return this.containerFieldValue;
	}

	public void setContainerFieldValue(String containerFieldValue) {
		this.containerFieldValue = containerFieldValue;
		if(containerFieldValue != null){
			putQueryParameter("ContainerFieldValue", containerFieldValue);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public String getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<String> getOperateErrorCodeLists() {
		return this.operateErrorCodeLists;
	}

	public void setOperateErrorCodeLists(List<String> operateErrorCodeLists) {
		this.operateErrorCodeLists = operateErrorCodeLists;	
		if (operateErrorCodeLists != null) {
			for (int i = 0; i < operateErrorCodeLists.size(); i++) {
				putQueryParameter("OperateErrorCodeList." + (i + 1) , operateErrorCodeLists.get(i));
			}
		}	
	}

	public String getSortColumn() {
		return this.sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
		if(sortColumn != null){
			putQueryParameter("SortColumn", sortColumn);
		}
	}

	public List<String> getAssetsTypeLists() {
		return this.assetsTypeLists;
	}

	public void setAssetsTypeLists(List<String> assetsTypeLists) {
		this.assetsTypeLists = assetsTypeLists;	
		if (assetsTypeLists != null) {
			for (int i = 0; i < assetsTypeLists.size(); i++) {
				putQueryParameter("AssetsTypeList." + (i + 1) , assetsTypeLists.get(i));
			}
		}	
	}

	public String getOperateTimeStart() {
		return this.operateTimeStart;
	}

	public void setOperateTimeStart(String operateTimeStart) {
		this.operateTimeStart = operateTimeStart;
		if(operateTimeStart != null){
			putQueryParameter("OperateTimeStart", operateTimeStart);
		}
	}

	public String getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
		if(timeStart != null){
			putQueryParameter("TimeStart", timeStart);
		}
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
		if(levels != null){
			putQueryParameter("Levels", levels);
		}
	}

	public String getParentEventTypes() {
		return this.parentEventTypes;
	}

	public void setParentEventTypes(String parentEventTypes) {
		this.parentEventTypes = parentEventTypes;
		if(parentEventTypes != null){
			putQueryParameter("ParentEventTypes", parentEventTypes);
		}
	}

	@Override
	public Class<DescribeSuspEventsResponse> getResponseClass() {
		return DescribeSuspEventsResponse.class;
	}

}
