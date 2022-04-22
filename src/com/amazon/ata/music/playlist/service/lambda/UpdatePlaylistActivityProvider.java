package com.amazon.ata.music.playlist.service.lambda;

import com.amazon.ata.music.playlist.service.dependency.DaggerServiceComponent;
import com.amazon.ata.music.playlist.service.dependency.ServiceComponent;
import com.amazon.ata.music.playlist.service.models.requests.UpdatePlaylistRequest;
import com.amazon.ata.music.playlist.service.models.results.UpdatePlaylistResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class UpdatePlaylistActivityProvider implements RequestHandler<UpdatePlaylistRequest, UpdatePlaylistResult> {


    public UpdatePlaylistActivityProvider() {

    }

    @Override
    public UpdatePlaylistResult handleRequest(final UpdatePlaylistRequest updatePlaylistRequest, Context context) {
        ServiceComponent serviceComponent = DaggerServiceComponent.create();
        return serviceComponent.provideUpdatePlaylistActivity().handleRequest(updatePlaylistRequest, context);
    }

}
