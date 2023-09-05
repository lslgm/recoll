package com.sinsa.recoll.DAO;


import com.sinsa.recoll.VO.RecollVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecollDAO {

    public List<RecollVO> selectAllRecoll() throws Exception;

    public void insertRecoll(RecollVO recollVO) throws Exception;

    public RecollVO selectUpdate(int sno) throws Exception;

    public void updateRecoll(RecollVO recollVO) throws Exception;

    public void deleteRecoll(int sno) throws Exception;
}
