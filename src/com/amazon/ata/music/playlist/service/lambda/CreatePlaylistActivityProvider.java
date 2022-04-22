package com.amazon.ata.music.playlist.service.lambda;


import com.amazon.ata.music.playlist.service.dependency.DaggerServiceComponent;
import com.amazon.ata.music.playlist.service.dependency.ServiceComponent;
import com.amazon.ata.music.playlist.service.models.requests.CreatePlaylistRequest;
import com.amazon.ata.music.playlist.service.models.results.CreatePlaylistResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CreatePlaylistActivityProvider implements RequestHandler<CreatePlaylistRequest, CreatePlaylistResult> {



    public CreatePlaylistActivityProvider() {

    }

    @Override
    public CreatePlaylistResult handleRequest(final CreatePlaylistRequest createPlaylistRequest, Context context) {
        ServiceComponent serviceComponent = DaggerServiceComponent.create();
        return serviceComponent.provideCreatePlaylistActivity().handleRequest(createPlaylistRequest, context);
    }

}
