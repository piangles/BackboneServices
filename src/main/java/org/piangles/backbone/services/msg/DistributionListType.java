/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
 
package org.piangles.backbone.services.msg;

/**
 * Entities can either be a direct Topic or an alias that
 * need to be translated to a topic using look up. It is the
 * callers /product developers responsibility to correctly design
 * if an entity should have a direct topic knowledge or alias.
 *
 * Hamlet
 * Hamlet: To be or not to be, that is the question. Whether 'tis nobler 
 * 			in the mind to suffer the slings and arrows of outrageous fortune, 
 * 			or take arms against a sea of troubles, and by opposing, end them.
 */
public enum DistributionListType
{
	Topic,
	Alias,
	Entity
}
