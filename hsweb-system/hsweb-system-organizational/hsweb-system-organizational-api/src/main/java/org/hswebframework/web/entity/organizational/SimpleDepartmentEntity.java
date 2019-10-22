/*
 *  Copyright 2019 http://www.hswebframework.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.hswebframework.web.entity.organizational;

import lombok.*;
import org.hswebframework.web.commons.entity.SimpleTreeSortSupportEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import java.util.List;

/**
 * 部门
 *
 * @author hsweb-generator-online
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "s_department",indexes = {
        @Index(name = "idx_dept_org_id",columnList = "org_id")
})
public class SimpleDepartmentEntity extends SimpleTreeSortSupportEntity<String> implements DepartmentEntity {
    private static final long serialVersionUID = -2137579829759620323L;
    //名称
    @Column
    private String name;
    //所在组织id
    @Column(name = "org_id")
    private String orgId;
    //部门编码
    @Column
    private String code;
    //是否启用
    @Column
    private Byte status;

    private List<DepartmentEntity> children;
    @Override
    @Id
    @Column(name = "u_id")
    public String getId() {
        return super.getId();
    }
}