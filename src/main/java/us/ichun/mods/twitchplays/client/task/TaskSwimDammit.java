package us.ichun.mods.twitchplays.client.task;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;

import java.util.Random;

/**
 * Author: SourceCoded
 * Who to blame: SourceCoded
 */
public class TaskSwimDammit extends Task {

    public TaskSwimDammit(WorldClient world, EntityPlayerSP player) {
        super(world, player);
    }

    @Override
    public boolean parse(String... args) {
        return args.length == 1;
    }

    @Override
    public int maxActiveTime() {
        return 0;
    }

    @Override
    protected void update() {
        Random rnd = new Random();
        if (rnd.nextInt(100) == 0)
            this.player.motionY = Math.abs(player.motionY * 10);
    }
}
