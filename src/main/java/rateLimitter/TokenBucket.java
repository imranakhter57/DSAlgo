package rateLimitter;

public class TokenBucket {
    private final long maxBucketSize;
    private final long refillRate;
    private long currBucketSize;
    private long lastRefillTimeStamp;

    public TokenBucket(long maxBucketSize, long refillRate) {
        this.maxBucketSize = maxBucketSize;
        this.refillRate = refillRate;
        
        currBucketSize = maxBucketSize;
        lastRefillTimeStamp =System.nanoTime();
    }
    
    public synchronized boolean allowRequest(long tokens){
        refill();
        
        if(currBucketSize>= tokens){
            currBucketSize -= tokens;
            return true;
        }
        return false;
    }
    
    private void refill() {
        long now = System.nanoTime();
        long tokenToAdd = (long) ((now-lastRefillTimeStamp) *refillRate/1e9);
        currBucketSize = Math.min(maxBucketSize, tokenToAdd);
        lastRefillTimeStamp = now;
    }
    
}
