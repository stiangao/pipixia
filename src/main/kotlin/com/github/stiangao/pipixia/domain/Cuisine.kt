package com.github.stiangao.pipixia.domain

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Version

/**
 * Created by shitiangao on 2017/8/28.
 */
@Entity
class Cuisine : BaseEntity() {

    var name = ""
    var type = ""
}

@Repository
interface CuisineRepository : CrudRepository<Cuisine, Long>