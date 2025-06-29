package org.example;
public class MyService {
        private final ExternalApi external;
        public MyService(ExternalApi external) {
            this.external = external;
        }
        public String fetchData() {
            return external.getData();
        }
    }
