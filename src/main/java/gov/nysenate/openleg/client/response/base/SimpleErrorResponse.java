package gov.nysenate.openleg.client.response.base;

public class SimpleErrorResponse extends BaseResponse
{
    public SimpleErrorResponse(String message) {
        this.message = message;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }
}
