package com.liujinlei.ftpdemo.ftputils;


import com.jcraft.jsch.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

/**
 * Title:
 * Description:
 *
 * @author liujinlei
 * @version 1.0
 */
public class Test {
    public static void main(String args[]) {
        String host = "148.70.68.65";
        int port = 22;
        String username = "ubuntu";
        String password = "ljl6899117";
        List<String> list = new ArrayList<String>();
        ChannelSftp sftp = null;
        Channel channel = null;
        Session sshSession = null;
        try {
            JSch jsch = new JSch();
            jsch.getSession(username, host, port);
            sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            channel = sshSession.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
            int t =1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}