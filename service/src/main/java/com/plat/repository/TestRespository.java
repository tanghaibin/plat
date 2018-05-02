package com.plat.repository;

import com.plat.po.TestPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author haibin.tang
 * @create 2018-04-27 上午9:20
 **/
@Repository
public interface TestRespository extends JpaRepository<TestPo, String> {
}
