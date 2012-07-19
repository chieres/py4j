/**
 * Copyright (c) 2009-2011, Barthelemy Dagenais All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * - The name of the author may not be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package py4j;

/**
 * <p>
 * This class implements a default {@link py4j.GatewayServerListener
 * GatewayServerListener}. All operations do nothing by default. Clients can
 * extend this class to only override the methods they need.
 * </p>
 * 
 * 
 * @author Barthelemy Dagenais
 * 
 */
public class DefaultGatewayServerListener implements GatewayServerListener {

	@Override
	public void serverStarted() {
	}

	@Override
	public void serverStopped() {
	}

	@Override
	public void serverError(Exception e) {
	}

	@Override
	public void serverPreShutdown() {
	}

	@Override
	public void serverPostShutdown() {
	}

	@Override
	public void connectionStarted(GatewayConnection gatewayConnection) {
	}

	@Override
	public void connectionStopped(GatewayConnection gatewayConnection) {
	}

	@Override
	public void connectionError(Exception e) {
	}

}
