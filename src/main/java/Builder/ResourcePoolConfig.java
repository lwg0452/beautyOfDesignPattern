package Builder;

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 0;
        private static final int DEFAULT_MAX_IDLE = 0;
        private static final int DEFAULT_MIN_IDLE = 0;


        String name;
        int maxTotal = DEFAULT_MAX_TOTAL;
        int maxIdle = DEFAULT_MAX_IDLE;
        int minIdle = DEFAULT_MIN_IDLE;

        public Builder setName(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Please check the input, name is null or empty.");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal should not be equal or smaller than 0.");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle should not be smaller than 0.");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle should not be smaller than 0.");
            }
            this.minIdle = minIdle;
            return this;
        }

        public ResourcePoolConfig build() {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Please check the input, name is null or empty.");
            }
            if (maxTotal < maxIdle) {
                throw new IllegalArgumentException("maxTotal should not be smaller than maxIdle.");
            }
            if (maxIdle < minIdle) {
                throw new IllegalArgumentException("maxIdle should not be smaller than minIdle.");
            }
            return new ResourcePoolConfig(this);
        }
    }


    public static void main(String[] args) {
        // pass
        ResourcePoolConfig config1 = new ResourcePoolConfig.Builder()
                .setName("db_connection_pool")
                .setMaxTotal(16)
                .setMaxIdle(16)
                .setMinIdle(2)
                .build();

        // throw exception: maxIdle should not be smaller than minIdle.
        ResourcePoolConfig config2 = new ResourcePoolConfig.Builder()
                .setName("db_connection_pool")
                .setMaxTotal(16)
                .setMaxIdle(8)
                .setMinIdle(10)
                .build();
    }
}

