package me.dousha.websocket;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author dousha <dousha0w0@vip.qq.com>
 * @date 2021/10/31
 * @project netty-websocket
 */
public class NettyConfig {
    //接入每一个进来的channel对象
    public static ChannelGroup group = new DefaultChannelGroup(
            GlobalEventExecutor.INSTANCE
    );

}
