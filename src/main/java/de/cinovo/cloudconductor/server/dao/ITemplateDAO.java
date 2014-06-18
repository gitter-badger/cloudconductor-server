package de.cinovo.cloudconductor.server.dao;

/*
 * #%L
 * cloudconductor-server
 * %%
 * Copyright (C) 2013 - 2014 Cinovo AG
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 * #L%
 */

import java.util.List;

import de.cinovo.cloudconductor.server.model.ETemplate;

/**
 * Copyright 2013 Cinovo AG<br>
 * <br>
 * 
 * @author psigloch
 * 
 */
public interface ITemplateDAO extends IAuditedEntity<ETemplate, Long>, IFindNamed<ETemplate> {
	
	/**
	 * @param packageServer the package server id
	 * @return the templates using the package server
	 */
	public List<ETemplate> findByPackageServer(Long packageServer);
}
