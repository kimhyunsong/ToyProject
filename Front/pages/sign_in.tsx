import { useRouter } from "next/router"

export default function sign_in() {    
    
    const router = useRouter();
    function movePage() {
        router.push(`/`);
    }

    return (
        <div className="container text-center">
            <div className="row">
                <div className="col">
                    <h1>Sign In</h1> 
                </div>
            </div>
            <div className="row">
            </div>
            <div className="row">
                <div className="col">
                    <div className="form-floating mb-3">
                        <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com" />
                        <label htmlFor="floatingInput">Identification</label>
                    </div>
                    <div className="form-floating mb-3">
                        <input type="text" className="form-control" id="floatingPassword" placeholder="Password" />
                        <label htmlFor="floatingPassword">Password</label>
                    </div>

                    <div className="form-floating mb-3">
                        <input type="text" className="form-control" id="floatingInput" placeholder="name@example.com" />
                        <label htmlFor="floatingInput">Full name</label>
                    </div>
                    <div className="form-floating mb-3">
                        <input type="text" className="form-control" id="floatingPassword" placeholder="Password" />
                        <label htmlFor="floatingPassword">NickName</label>
                    </div>
                    <div className="form-floating mb-3">
                        <input type="text" className="form-control" id="floatingPassword" placeholder="Password" />
                        <label htmlFor="floatingPassword">Email</label>
                    </div>
                    <div className="form-check">
                        <input className="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked /> 
                        <label className="form-check-label" htmlFor="exampleRadios1">
                            Man
                        </label>
                    </div>
                    <div className="form-check">
                        <input className="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2" />
                        <label className="form-check-label" htmlFor="exampleRadios2">
                            Woman
                        </label>
                    </div>
                    <div className="row">
                        <button type="button" className="btn btn-outline-secondary">Sign In</button>
                    </div>
                </div>
            </div>
        </div>
    )
}