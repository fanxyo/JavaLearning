package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-02  09:57
 * @Description: TODO
 * @Version: 1.0
 */

class Speaker {
}
class AudioPlayer {
    //方法声明为 private，则除了 AudioPlayer 外，其他类将不能访问该方法。
    protected boolean openSpeaker(Speaker sp){
        //实现细节
        return false;
    }

}

class StreamingAudioPlayer extends AudioPlayer{
    @Override
    protected boolean openSpeaker(Speaker sp) {
        //实现细节
        return super.openSpeaker(sp);
    }
}
