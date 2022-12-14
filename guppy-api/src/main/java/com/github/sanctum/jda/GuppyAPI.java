package com.github.sanctum.jda;

import com.github.sanctum.jda.common.Channel;
import com.github.sanctum.jda.common.Command;
import com.github.sanctum.jda.common.Emoji;
import com.github.sanctum.jda.common.Guppy;
import com.github.sanctum.jda.common.JDAController;
import com.github.sanctum.jda.common.Role;
import com.github.sanctum.panther.container.PantherCollection;
import com.github.sanctum.panther.event.Vent;
import com.github.sanctum.panther.file.Configurable;
import com.github.sanctum.panther.recursive.Service;
import com.github.sanctum.panther.recursive.ServiceFactory;
import com.github.sanctum.panther.util.Deployable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface GuppyAPI extends Service {

	static @NotNull GuppyAPI getInstance() {
		return ServiceFactory.getInstance().getService(GuppyAPI.class);
	}

	/**
	 * Attempt retrieval on known guppy instance.
	 *
	 * @param id        a valid user mention id or user-name.
	 * @param isMention Whether the provided id is a mention id or not.
	 * @return a guppy user if found.
	 */
	@Nullable Guppy getGuppy(@NotNull String id, boolean isMention);

	/**
	 * Attempt retrieval on a known guppy instance.
	 *
	 * @param id a valid user id.
	 * @return a guppy user if found.
	 */
	@Nullable Guppy getGuppy(long id);

	/**
	 * Get all known guppies loaded in cache.
	 *
	 * @return all known guppies.
	 */
	@NotNull PantherCollection<Guppy> getGuppies();

	/**
	 * @param name
	 * @return
	 */
	@Nullable Channel getChannel(@NotNull String name);

	/**
	 * @param id
	 * @return
	 */
	@Nullable Channel getChannel(long id);

	/**
	 * @return
	 */
	@NotNull PantherCollection<Channel> getChannels();

	/**
	 * @param label
	 * @return
	 */
	@Nullable Command getCommand(@NotNull String label);

	/**
	 * @return
	 */
	@NotNull PantherCollection<Command> getCommands();

	/**
	 * @return
	 */
	@NotNull Deployable<Void> updateCommands();

	/**
	 * @param name
	 * @return
	 */
	@Nullable Role getRole(@NotNull String name);

	/**
	 * @param id
	 * @return
	 */
	@Nullable Role getRole(long id);

	/**
	 * @return
	 */
	@NotNull PantherCollection<Role> getRoles();

	/**
	 * @param name
	 * @return
	 */
	@Nullable Emoji getEmoji(@NotNull String name);

	/**
	 * @param id
	 * @return
	 */
	@Nullable Emoji getEmoji(long id);

	/**
	 * @return
	 */
	@NotNull PantherCollection<Emoji> getEmojis();

	/**
	 * @return
	 */
	@NotNull JDAController getController();

	/**
	 * @return
	 */
	@NotNull Configurable getConfig();

	/**
	 * @return
	 */
	@NotNull Vent.Host getHost();

}
