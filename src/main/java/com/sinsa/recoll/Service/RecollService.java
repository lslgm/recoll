package com.sinsa.recoll.Service;


import com.sinsa.recoll.VO.RecollVO;

import java.util.List;

public interface RecollService {
    public List<RecollVO> selectAllRecoll() throws Exception;

    public void insertRecoll(RecollVO recollVO) throws Exception;

    public RecollVO selectUpdate(int sno) throws Exception;

    public void updateRecoll(RecollVO recollVO) throws Exception;

    public void deleteRecoll(int sno) throws Exception;

}
