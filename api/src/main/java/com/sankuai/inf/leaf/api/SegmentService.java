package com.sankuai.inf.leaf.api;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.segment.SegmentIDGenImpl;

public interface SegmentService {
    Result getId(String key);
    SegmentIDGenImpl getIdGen();
}
