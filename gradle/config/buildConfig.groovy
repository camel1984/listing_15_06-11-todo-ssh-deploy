binaryRepository {
    baseUrl = 'https://dl.bintray.com'
    releaseUrl = "$baseUrl/wsjorg/test/"
}

environments {
    local {
        server {
            hostname = '127.0.0.1'
            sshPort = 2222
            username = 'vagrant'
        }

        tomcat {
            hostname = '193.168.1.33'
            port = 8080
            context = 'todo-web'
        }
    }
}